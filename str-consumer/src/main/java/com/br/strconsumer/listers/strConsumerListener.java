package com.br.strconsumer.listers;

import com.br.strconsumer.custom.strConsumerCustomListener;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class strConsumerListener {

    @strConsumerCustomListener(groupId = "group-1")
    public void create (String message){

        log.info("CREATE ::: Received message: {}",message);
    }

    @strConsumerCustomListener(groupId = "group-1")
    public void log (String message){

        log.info("LOG ::: Received message: {}",message);
    }

    //Escutando container de validação
    @KafkaListener(groupId = "group-2",topics = "str-topic", containerFactory = "validMessageContainerFactory")
    public void history (String message){

        log.info("HISTORY ::: Received message: {}",message);
    }

}

//OBS: NÃO PODE TER MAIS CONSUMIDORES DO MESMO GRUPO DO QUE NUMEROS DE PARTIÇÕES//
