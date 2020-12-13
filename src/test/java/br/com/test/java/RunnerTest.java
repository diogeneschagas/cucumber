package br.com.test.java;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty",
        features = {"src/test/java/resources/subindo_nivel.feature"},
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false // Validação do mapeamento enquanto os testes estão sendo criados
                        // muito útil quando temos testes demorados, pois ele fará um mapeamento


        )
public class RunnerTest {

}
