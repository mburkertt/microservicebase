package ch.erni.microservicebase.Service;

import ch.erni.microservicebase.Model.Example;
import org.springframework.stereotype.Service;

/**
 * Created by buma on 19.01.2017.
 */

@Service
public interface ExampleService {

    /**
     * This method receives a String and delivers an example object with the modified string
     * @param uncompleteExample
     * @return Example example
     */
    Example getCompletedExample(String uncompleteExample);

}
