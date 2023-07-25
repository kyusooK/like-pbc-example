package likepbc.common;

import io.cucumber.spring.CucumberContextConfiguration;
import likepbc.PostApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { PostApplication.class })
public class CucumberSpingConfiguration {}
