import java.util.List;

public class Token implements IToken{
    private Integer id;
    private String name;
    private Player player;
    private Integer strength;
    private Integer dexterity;
    private Integer constitution;
    private Integer intelligence;
    private Integer wisdom;
    private Integer charisma;

    public Token (Integer id){
        this.id = id;
    }

    public Token(Integer id, String name, Player player, Integer strength, Integer dexterity, Integer constitution, Integer intelligence, Integer wisdom, Integer charisma) {
        this.id = id;
        this.name = name;
        this.player = player;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public Integer getId(){
        return this.id;
    }

    @Override
    public List<String> getTokenBattleData() {
        return null;
    }

    @Override
    public List<Token> getTokenInformation(Player player) {
        return null;
    }
}
