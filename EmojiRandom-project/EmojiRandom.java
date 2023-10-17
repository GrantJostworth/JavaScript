import java.util.Random;
public class EmojiRandom {
    static long seed = 9786;
    static Random random = new Random(seed);

    public static double emojiRandom()
    {
        return (random.nextDouble());
    }
}
