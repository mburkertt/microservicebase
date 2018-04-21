package ch.erni.microservicebase.Service;

import org.springframework.stereotype.Service;

import ch.erni.microservicebase.Model.Example;
/**
 * Created by buma on 19.01.2017.
 */
@Service
public class ExampleServiceImpl implements ExampleService {

    public Example getCompletedExample(String uncompleteExample) {
		Example example;
		if (uncompleteExample != null) {
			String completedExample = uncompleteExample.replaceAll("un", "");
			example = new Example();
			example.setCompletedExample(completedExample);
			return example;
		} else {
			throw new NullPointerException();
		}
	}

}
