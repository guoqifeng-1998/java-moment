package main.java.com.soft2036.study.week2;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName phone
 * @Description TODO
 * @Author 郭崎锋
 * @Date 2020/10/12
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Phone {
    private String brand;
    private Integer price;
}
