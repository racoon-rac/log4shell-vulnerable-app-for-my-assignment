package fr.christophetd.log4shell.vulnerableapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.Controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Controller
public class MainController {

    private static final Logger logger = LogManager.getLogger("HelloWorld");

    // public String index(@RequestHeader("X-Api-Version") String apiVersion) {
    //     logger.info("Received a request for API version " + apiVersion);
    //     return "こんにちは、世界！";
    // }
    @GetMapping("/")
    public String index() {
        return "<html>\n" + "<header><title>Welcome</title></header>\n" +
          "<body>\n" + "Hello world\n" + "</body>\n" + "</html>";
    }

}
