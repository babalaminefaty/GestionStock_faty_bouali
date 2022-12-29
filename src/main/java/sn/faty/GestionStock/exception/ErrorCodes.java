package sn.faty.gestionstock.exception;

public enum ErrorCodes {

    ARTICLE_NOT_FOUND(1000),
     ARTICLE_NOT_VALID(1001),
    ARTICLE_DEJA_UTILISE(1002),


    CATEGORY_NOT_FOUND(2000),
     CATEGORY_DEJA_UTILISE(2001),
    CATEGORY_NOT_VALID(2001),

    CLIENT_NOT_FOUND(3000),
    CLIENT_NOT_VALID(3001),
     COMMANDE_QUI_A_DEJA_COMMANDE(3002),

    COMMANDE_CLIENT_NOT_FOUND(4000),
    COMMANDE_CLIENT_NOT_VALID(4001)
    , COMMANDE_CLIENT_DEJA_UTILISE(4002),
     COMMANDE_NON_MODIFIABLE(4002),


    COMMANDE_FOURNISSEUR_NOT_FOUND(5000),
    COMMANDE_FOURNISSEUR_NOT_VALID(5001),
    COMMANDE_FOURNISSEUR_DEJA_UTILISE(5002),



    ENTREPRISE_NOT_FOUND(6000),


    FOURNISSEUR_NOT_FOUND(7000),
    FOURNISSEUR_NOT_VALID(7001),

    LIGNE_COMMANDE_CLIENT(8000),

    LIGNE_COMMANDE_FOURNISSEUR(9000),

    LIGNE_VENTE_FOURNISSEUR(10000),

    MOUVEMENT_STOCK(110000),


    ROLES(12000),


    UTILISATEUR(13000),
    UTILISATEUR_ALREADY_EXIST(13001),
    UTILISATEUR_NOT_FOUND(13005),

    MOT_DE_PASSE_UTILISATEUR_ET_CONFIRMATION_NON_CONFORME(13002),
    MOT_DE_PASSE_UTILISATEUR_OU_ET_CONFIRMATION_NON_CONFORME(13004),
    CONFIRMATION_VIDE(13003),
    SAVED_PHOTO(1400)


    , Vente_DEJA_EFFECTUE(15001),
    VENTES_NOT_FOUND(15000),
    BAD_CREDENTIALS(15001);


    private  int code ;
    ErrorCodes(int code) {
        this.code=code ;
    }
    public int getCode() {
        return code;
    }
}
