
 
public class InterfaceTester {
    
    static TeamType team = new Team();
    
    public static void main(String[] args){
        team.setCity("SomeCity");
        team.setName("SomeName");
        team.setPlayers(null);
        System.out.println(team.getFullName());
    }
    
}
