package suporte;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Luiz Fernando\\Documents\\Qaut\\java\\sitesoc\\features\\cenariobuscablog.feature",
glue = { "" },
monochrome = true,
plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
dryRun = false)

public class cucumberTest {

}
