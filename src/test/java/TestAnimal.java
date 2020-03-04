import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestAnimal {

    private TestAnimal animal;
    Animal an = new Animal();

    @Before
    public void setUp() throws Exception {
        animal = new TestAnimal();
    }

    @Test
    public void name() {
        Assert.assertEquals(" ", an.getName());

    }

    @Test
    public void averageWeight() {
        Assert.assertEquals(" ", an.getAverageWeight());

    }

    @Test
    public void numberOfLegs() {
        Assert.assertEquals(" ", an.getNumberOfLegs());
    }
}