package com.sosyalmedya.config.rabbit;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    /**
     * RabbitMQ bir mesajı iletmek için bir exchange ve query kullanır.
     * Bu iki yapı arasında bir routing-key bulunur. Bu tanımlamaları yapılandırmak için
     * bunların işlemlerini tanımlamamız gerekiyor.
     */
    private final String directExchangeAuth = "direct-exchange-auth";
    private final String queueAuthCreateProfile = "queue-auth-create-profile";
    private final String routingKeyAuth = "routing-ket-auth-create-profile";

    /**
     * Burada kuyruğu tanımlamak için ortamda Bean ile nesneleri enjekte ediyoruz.
     */
    @Bean
    DirectExchange directExchangeAuthMethod() {
        return new DirectExchange((directExchangeAuth));
    }

    @Bean
    Queue createQueueAuthCreateProfileMethod() {
        return new Queue(queueAuthCreateProfile);
    }

    /**
     * Bu kısımda ortamda oluşturduğumuz Exchange ile Queue arasında bir yol bir bağlantı oluşturuyoruz.
     * böylece mesajlarımızı bu yolla iletebiliyoruz.
     */
    @Bean
    public Binding bindingCreateProfileMethod(final DirectExchange directExchangeAuthMethod, final Queue createQueueAuthCreateProfileMethod) {
        return BindingBuilder.bind(createQueueAuthCreateProfileMethod)
                .to(directExchangeAuthMethod)
                .with(routingKeyAuth);
    }
}
