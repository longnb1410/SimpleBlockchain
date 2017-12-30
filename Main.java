import java.util.Arrays;

public class Main {
    /**
        Each block will have:
            List of transactions
            Previous Hash
            Hash
     */

    public static void main(String[] args) {

        String[] genesisTransactions = {"A sent B 999 bitcoin"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] block2Transactions = {"B sent C 50 bitcoin"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        String[] block3Transactions = {"C sent D 40 bitcoin"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);

        System.out.println("- Genesis block:");
        System.out.println("Current blockhash: " + genesisBlock.getBlockHash());
        
        System.out.println("- Block 2:");
        System.out.println("Previous blockhash: " + block2.getPreHash());
        System.out.println("Current blockhash: " + block2.getBlockHash());

        System.out.println("- Block 3:");
        System.out.println("Previous blockhash: " + block3.getPreHash());
        System.out.println("Current blockhash: " + block3.getBlockHash());
    }
}