import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by longnb149 on 2017-12-25.
 */
public class Block {

    private int preHash;    //previous hash
    private int blockHash;  //current hash
    private String[] transactions;

    public Block(int preHash, String[] transactions) {
        this.preHash = preHash;
        this.transactions = transactions;

        Object[] contents = {Arrays.hashCode(transactions), preHash}; //hash transactions of contents
        this.blockHash = Arrays.hashCode(contents);      //generate current block of hash

    }

    public int getPreHash() {
        return preHash;
    }

    public String[] getTransaction() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }
    //
}