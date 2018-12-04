#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: Matériel
#------------------------------------------------------------

CREATE TABLE Materiel(
        materiel_id    Int  Auto_increment  NOT NULL ,
        nom            Varchar (50) NOT NULL ,
        quantite_dispo Int NOT NULL
	,CONSTRAINT Materiel_PK PRIMARY KEY (materiel_id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: EtapeRecette
#------------------------------------------------------------

CREATE TABLE EtapeRecette(
        etape_recette_id       Int  Auto_increment  NOT NULL ,
        pour_personnel_basique Bool NOT NULL ,
        temps_realisation      Int NOT NULL ,
        numero_etape           Int NOT NULL
	,CONSTRAINT EtapeRecette_PK PRIMARY KEY (etape_recette_id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Carte
#------------------------------------------------------------

CREATE TABLE Carte(
        carte_id Int  Auto_increment  NOT NULL ,
        jour     Date NOT NULL
	,CONSTRAINT Carte_PK PRIMARY KEY (carte_id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Plat
#------------------------------------------------------------

CREATE TABLE Plat(
        plat_id Int  Auto_increment  NOT NULL ,
        nom     Varchar (50) NOT NULL
	,CONSTRAINT Plat_PK PRIMARY KEY (plat_id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Recette
#------------------------------------------------------------

CREATE TABLE Recette(
        recette_id       Int  Auto_increment  NOT NULL ,
        nom              Varchar (50) NOT NULL ,
        prep_en_amont    Bool NOT NULL ,
        categorie        Int NOT NULL ,
        nbr_personnes    Int NOT NULL ,
        plat_id          Int NOT NULL ,
        etape_recette_id Int NOT NULL
	,CONSTRAINT Recette_PK PRIMARY KEY (recette_id)

	,CONSTRAINT Recette_Plat_FK FOREIGN KEY (plat_id) REFERENCES Plat(plat_id)
	,CONSTRAINT Recette_EtapeRecette0_FK FOREIGN KEY (etape_recette_id) REFERENCES EtapeRecette(etape_recette_id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Ingredient
#------------------------------------------------------------

CREATE TABLE Ingredient(
        ingredient_id   Int  Auto_increment  NOT NULL ,
        nom             Varchar (50) NOT NULL ,
        type            Int NOT NULL ,
        date_peremption Date NOT NULL
	,CONSTRAINT Ingredient_PK PRIMARY KEY (ingredient_id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Stock
#------------------------------------------------------------

CREATE TABLE Stock(
        sotck_id      Int  Auto_increment  NOT NULL ,
        temperature   Int NOT NULL ,
        quantite      Int NOT NULL ,
        ingredient_id Int NOT NULL
	,CONSTRAINT Stock_PK PRIMARY KEY (sotck_id)

	,CONSTRAINT Stock_Ingredient_FK FOREIGN KEY (ingredient_id) REFERENCES Ingredient(ingredient_id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Vin
#------------------------------------------------------------

CREATE TABLE Vin(
        vin_id Int  Auto_increment  NOT NULL ,
        nom    Varchar (50) NOT NULL ,
        annee  Year NOT NULL
	,CONSTRAINT Vin_PK PRIMARY KEY (vin_id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: compose
#------------------------------------------------------------

CREATE TABLE compose(
        carte_id Int NOT NULL ,
        plat_id  Int NOT NULL
	,CONSTRAINT compose_PK PRIMARY KEY (carte_id,plat_id)

	,CONSTRAINT compose_Carte_FK FOREIGN KEY (carte_id) REFERENCES Carte(carte_id)
	,CONSTRAINT compose_Plat0_FK FOREIGN KEY (plat_id) REFERENCES Plat(plat_id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: utilise
#------------------------------------------------------------

CREATE TABLE utilise(
        materiel_id      Int NOT NULL ,
        etape_recette_id Int NOT NULL
	,CONSTRAINT utilise_PK PRIMARY KEY (materiel_id,etape_recette_id)

	,CONSTRAINT utilise_Materiel_FK FOREIGN KEY (materiel_id) REFERENCES Materiel(materiel_id)
	,CONSTRAINT utilise_EtapeRecette0_FK FOREIGN KEY (etape_recette_id) REFERENCES EtapeRecette(etape_recette_id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: cuisine
#------------------------------------------------------------

CREATE TABLE cuisine(
        ingredient_id    Int NOT NULL ,
        etape_recette_id Int NOT NULL ,
        quantite         Int NOT NULL
	,CONSTRAINT cuisine_PK PRIMARY KEY (ingredient_id,etape_recette_id)

	,CONSTRAINT cuisine_Ingredient_FK FOREIGN KEY (ingredient_id) REFERENCES Ingredient(ingredient_id)
	,CONSTRAINT cuisine_EtapeRecette0_FK FOREIGN KEY (etape_recette_id) REFERENCES EtapeRecette(etape_recette_id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: propose
#------------------------------------------------------------

CREATE TABLE propose(
        vin_id   Int NOT NULL ,
        carte_id Int NOT NULL




	=======================================================================
	   Désolé, il faut activer cette version pour voir la suite du script ! 
	=======================================================================
