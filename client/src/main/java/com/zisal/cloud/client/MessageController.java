package com.zisal.cloud.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2/24/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@RestController
@RefreshScope
public class MessageController {

    @Value("${message: Default Hello}")
    private String message;

    @GetMapping("/message")
    public String getMessage(){
        return message;
    }
}
