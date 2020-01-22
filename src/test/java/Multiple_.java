import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Multiple_ {

    @Test
    public void given_a_1_return_1(){
        assertThat(Multiple.of(1)).isEqualTo(1);
    }
    
}
