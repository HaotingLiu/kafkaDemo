package model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.mock.staticmock.MockStaticEntityMethods;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

/**
 * Created by hliu on 5/24/2016.
 */
@SpringBootApplication
public class callSql {
    public static void find(long id){
        SpringApplication.run(callSql.class);
        for(int i=0;i<10000;++i){
            find(id+i);
        }
    }
}
@Entity
class inventoryAir{
    private @Id @GeneratedValue Long id;
    private String airlineName, departure, arrival, availabiliy;
    private inventoryAir(){};

    public inventoryAir(String a, String b, String c, String d){
        this.airlineName=a;
        this.departure=b;
        this.arrival=c;
        this.availabiliy=d;
    }
}



