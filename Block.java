import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by longnb149 on 2017-12-25.
 */
public class Block {

    private int preHash;    //previous hash
    private int blockHash;  //current hash
    private String[] data; //data

    public Block(int preHash, String[] data) {
        this.preHash = preHash;
        this.data = data;

        Object[] contents = {Arrays.hashCode(data), preHash};  //hash data and preHash ~> contents
        this.blockHash = Arrays.hashCode(contents);      //generate current block hash base on preHash and data .

    }

    public int getPreHash() {
        return preHash;
    }

    public String[] getData() {
        return data;
    }

    public int getBlockHash() {
        return blockHash;
    }
}