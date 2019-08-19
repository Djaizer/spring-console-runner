package spring.console.runner;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import spring.console.runner.domain.Image;
import spring.console.runner.service.ImageService;


@Component
@Order(value=2)
public class DatabaseLoader implements CommandLineRunner {

    final Logger logger = LoggerFactory.getLogger(DatabaseLoader.class);
    private ImageService imageService;

    public DatabaseLoader(ImageService imageService) {
        this.imageService = imageService;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Logger i working in service hire... 123");
        imageService.save(new Image("Image 1"));
        imageService.save(new Image("Image 2"));
        imageService.save(new Image("Image 3", "Title 3"));
    }
}
