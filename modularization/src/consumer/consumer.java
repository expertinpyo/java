package consumer;

import java.util.List;
import java.util.logging.Logger;

import sorting.MySorting;

public class consumer {

	public static Logger logger = Logger.getLogger(consumer.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MySorting util = new MySorting();
		List<String> sorted = util.sort(List.of("sdnfj", "snjdfksjdkf", "bqhjweh", "asd"));
		logger.info(sorted.toString());

	}

}
