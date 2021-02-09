package fit.core;

import java.util.function.Function;

public class FuncLogger {

	public static Function<String, String> create(String prefix) {
		
		return requestText -> {
            var  formatRequest= String.format("%s %s", prefix, requestText);

            return formatRequest;
		};
	}

}
