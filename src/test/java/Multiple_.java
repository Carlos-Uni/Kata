import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Multiple_ {

    @Test
    public void given_a_1_return_1(){
        assertThat(Multiple.of(1)).isEqualTo(0);
    }

    @Test
    public void given_a_4_return_3(){
        assertThat(Multiple.of(4)).isEqualTo(3);
    }

    @Test
    public void given_a_10_return_23(){
        assertThat(Multiple.of(10)).isEqualTo(23);
    }
}
