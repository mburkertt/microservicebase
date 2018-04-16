package ch.erni.microservicebase.Service;

import ch.erni.microservicebase.Model.Example;
import org.springframework.stereotype.Service;

/**
 * Created by buma on 19.01.2017.
 */

@Service
public interface ExampleService {

    Example getCompletedExample(String uncompleteExample);

}
