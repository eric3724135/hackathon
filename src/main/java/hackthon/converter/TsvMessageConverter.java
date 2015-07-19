package hackthon.converter;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import hackthon.domain.TsvResponse;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.ReflectionUtils;

public class TsvMessageConverter extends
		AbstractHttpMessageConverter<TsvResponse> {

	public static final MediaType MEDIA_TYPE = new MediaType("text", "tsv",
			Charset.forName("utf-8"));


	public TsvMessageConverter() {
		super(MEDIA_TYPE);
	}

	protected boolean supports(Class<?> clazz) {
		return TsvResponse.class.equals(clazz);
	}

	@Override
	protected TsvResponse readInternal(Class<? extends TsvResponse> clazz,
			HttpInputMessage inputMessage) throws IOException,
			HttpMessageNotReadableException {
		return null;
	}

	protected void writeInternal(TsvResponse tsvResponse,
			HttpOutputMessage output) throws IOException,
			HttpMessageNotWritableException {
		output.getHeaders().setContentType(MEDIA_TYPE);
		output.getHeaders().set("Content-Disposition",
				"attachment; filename=\"" + tsvResponse.getFilename() + "\"");
		final OutputStream out = output.getBody();

		writeColumnTitles(tsvResponse, out);

		if (tsvResponse.getRecords() != null
				&& tsvResponse.getRecords().size() != 0) {
			writeRecords(tsvResponse, out);
		}

		out.close();
	}

	private void writeRecords(TsvResponse response, OutputStream out)
			throws IOException {
		List<String> getters = getObjectGetters(response);
		for (final Object record : response.getRecords()) {
			for (String getter : getters) {
				try {
					Method method = ReflectionUtils.findMethod(
							record.getClass(), getter);
					out.write(method.invoke(record).toString()
							.getBytes(Charset.forName("utf-8")));
					out.write('\t');
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			out.write('\n');
		}
	}

	private List<String> getObjectGetters(TsvResponse response) {
		List<String> getters = new ArrayList<>();
		for (Method method : ReflectionUtils.getAllDeclaredMethods(response
				.getRecords().get(0).getClass())) {
			String methodName = method.getName();
			if (methodName.startsWith("get") && !methodName.equals("getClass")) {
				getters.add(methodName);
			}
		}
	
		Collections.sort(getters, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o2.compareTo(o1);
			}
			
		});
//		sort(getters);
		return getters;
	}

	private void writeColumnTitles(TsvResponse response, OutputStream out)
			throws IOException {
		for (String columnTitle : response.getColumnTitles()) {
			out.write(columnTitle.getBytes());
			out.write('\t');
		}
		out.write('\n');
	}
}