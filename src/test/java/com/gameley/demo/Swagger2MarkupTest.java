package com.gameley.demo;

import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@AutoConfigureRestDocs(outputDir = "build/asciidoc/snippets")
public class Swagger2MarkupTest {
//    private RestTemplate restTemplate = new RestTemplate();
//
//    @Test
//    public void createSpringfoxSwaggerJson() throws Exception {
////        String baseurl = System.getProperty("custom.baseurl");//mvn后面指定-Dcustom.baseurl=xx.xx.xx.xx来实现自定义的采集
//        String baseurl = "localhost:8080";
//        String swaggerUrl = "http://" + baseurl + "/v2/api-docs";
////        String outputDir = System.getProperty("io.springfox.staticdocs.outputDir");
//        String outputDir = "target/asciidoc";
//        System.out.println("swaggerUrl: " + swaggerUrl);
//        System.out.println("outputDir: " + outputDir);
//
//        String swaggerJson = restTemplate.getForObject(swaggerUrl, String.class);
//
//        Files.createDirectories(Paths.get(outputDir));
//        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputDir, "swagger.json"), StandardCharsets.UTF_8)) {
//            writer.write(swaggerJson);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
