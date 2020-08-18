package oneTheJi.java8.stream.streamExample;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OnlineClass {
    private Integer id;

    private String title;

    private boolean closed;

    public OnlineClass(Integer id, String title, boolean closed) {
        this.id = id;
        this.title = title;
        this.closed = closed;
    }
}
