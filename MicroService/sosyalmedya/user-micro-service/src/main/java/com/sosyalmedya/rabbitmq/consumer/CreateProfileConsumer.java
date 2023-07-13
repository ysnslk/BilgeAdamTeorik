package com.sosyalmedya.rabbitmq.consumer;

import com.sosyalmedya.rabbitmq.model.CreateProfile;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateProfileConsumer {
    @RabbitListener(queues = "queue-auth-create-profile")
    public void consumeCreateProfile(CreateProfile createProfile) {
        System.out.println("Create Profile: " + createProfile);
    }
}
