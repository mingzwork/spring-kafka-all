package ca.mingz.dev.demo.spring.kafka.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.messaging.Message;

@SpringBootApplication
public class ApplicationConsumer{
    public static Logger logger = LoggerFactory.getLogger(ApplicationConsumer.class);

	public static void main(String[] args) {
		SpringApplication.run(ApplicationConsumer.class, args);
	}

	@Value("${kafka.topic}")
	private String topic;
    // Simple consumer
    // auto assign partition
    @KafkaListener(topics = "${kafka.topic}")
    // consumer tells kafka which partition it will read, in this case multiple consumer can read from same partition
    // of same topic which results in duplicate message to be received?!?!
//    @KafkaListener(topicPartitions =
//    {
//            @TopicPartition(topic = "${kafka.topic}", partitions = "1")
//    })
    public void listen0(Message<?> message) throws Exception {
        logger.info("-- consumer 0 --" + message.getHeaders().toString());
        logger.info("-- consumer 0 --" + message.getPayload().toString());
    }

//    // Consumer from a given offset
//    @KafkaListener(topicPartitions =
//    {
//        @TopicPartition(topic = "${kafka.topic}", partitionOffsets = @PartitionOffset(partition = "0", initialOffset = "20"))
//    })
//    public void listen2(Message<?> message) throws Exception {
//        logger.info("-- consumer 1 --" + message.getHeaders().toString());
//        logger.info("-- consumer 1 --" + message.getPayload().toString());
//    }
}
