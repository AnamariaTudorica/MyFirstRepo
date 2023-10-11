package ro.scoalainformala.domain;
/*
    Characteristics  of the organisms (domain of the problem):-Viruses: Rotavirus , Adenovirus
                                                              -Bacteria : Escherichia  Coli, Salmonella
                                                              -Parasites-unicelular: Giardia intestinalis
    Proprieties: Viruses- Rotavirus  -Shape :Sferic (11 proteins on surface), Dimensions around  27-35 nm,core: RNA- genom
                        - Adenovirus -Shape : Sferic (9 proteins on surface), Dimension around  80-100 nm,core:DNA -genom
                 -Bacteria :E. Coli shape : rod-shaped:cylinder in center and (5 flagels), Dimensions: 1.5 -0.5 micrometers (µm)
                            Salmonella rod-shaped with (3 flagels), Dimensions: 0.5- 1.5 micrometers (µm)
                -Parasites-Giardia intestinalis : ovoid  form, Dimension: 8-9 micrometers (µm), cores :2-4 in number
    Common behaviour of organisms (actions/ methods):

        -ability to multiply in humans and animals bodies
        -ability to be neutralised  with treatment

 */
public abstract class Organisms { // abstract class with abstract methods

    public abstract String multiplicationRate ();
    public abstract String treatmentProduct ();
    public abstract String getName();
    public abstract double getLength();
}
