package fr.uga.l3miage.pc.prisonersdilemma.Strategies.Independantes;


import fr.uga.l3miage.pc.prisonersdilemma.enums.Decision;
import fr.uga.l3miage.pc.prisonersdilemma.interfaces.Strategy;
import lombok.Getter;

@Getter
public class ToujoursTrahir implements Strategy {

    private  String name ;

    public ToujoursTrahir() {
        this.name = "ToujoursTrahir";
    }

    public Decision execute() {
        return Decision.TRAHIR;
    }
}
