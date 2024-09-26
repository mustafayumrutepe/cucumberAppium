package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {
                "pretty", "json:target/cucumber.json",},    //plugin, test raporu oluşturmadaki target hedef yerimiz
        features = "src/test/resources/features",           //features, senaryolarımızın path i
        glue = "stepdefinitions",                           //testi yaptığımız classlar
        tags = "@amazon",
        dryRun = false                                      //dryRun, testlerimiz(stepdefinitions) çalıştırılmadan önce true yaptığımızda bir biriyle olan ilişkisini kontrol etme
)

public class Runner extends AbstractTestNGCucumberTests {   //içindeki şeyleri daha rahat kullanmak için bunu extend yaptık
}
