/*
Nama      : Shafira Dwi Nur'Izzati
Nim       : 22166018
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO
*/
package pkg22166018.pbo.lat60;
public class PBOLat60 {
    
}
class Akatsuki {
    private final String name;
    private final String village;
    private final String jutsu;

    public Akatsuki(String name, String village, String jutsu) {
        this.name = name;
        this.village = village;
        this.jutsu = jutsu;
    }

    public String getName() {
        return name;
    }

    public String getVillage() {
        return village;
    }

    public String getJutsu() {
        return jutsu;
    }

    public String performJutsu() {
        return "Performing jutsu: " + jutsu;
    }
}
class AkatsukiMember extends Akatsuki {
    private final String ability;

    public AkatsukiMember(String name, String village, String jutsu, String ability) {
        super(name, village, jutsu);
        this.ability = ability;
    }

    public String getAbility() {
        return ability;
    }

    public String performSpecialAbility() {
        return "Using special ability: " + ability;
    }
}
class AkatsukiLeader extends Akatsuki {
    private final String leadership;

    public AkatsukiLeader(String name, String village, String jutsu, String leadership) {
        super(name, village, jutsu);
        this.leadership = leadership;
    }

    public String getLeadership() {
        return leadership;
    }
}
public class MainProgram {
    public static void main(String[] args) {
        AkatsukiMember member = new AkatsukiMember("Deidara", "Iwagakure", "Explosive Clay", "Artistic Explosions");
        AkatsukiLeader leader = new AkatsukiLeader("Pain", "Amegakure", "Rinnegan", "Mastermind Tactics");

        displayCharacterInfo(member);
        displayCharacterInfo(leader);
    }

    private static void displayCharacterInfo(Akatsuki character) {
        System.out.println("Name: " + character.getName());
        System.out.println("Village: " + character.getVillage());
        System.out.println("Jutsu: " + character.getJutsu());
        System.out.println(character.performJutsu());

        if (character instanceof AkatsukiMember) {
            AkatsukiMember member = (AkatsukiMember) character;
            System.out.println("Special Ability: " + member.getAbility());
            System.out.println(member.performSpecialAbility());
        } else if (character instanceof AkatsukiLeader) {
            AkatsukiLeader leader = (AkatsukiLeader) character;
            System.out.println("Leadership Style: " + leader.getLeadership());
        }

        System.out.println();
    }
}

