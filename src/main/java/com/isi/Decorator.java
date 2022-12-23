package com.isi;

public abstract class Decorator extends NotifComponent{

    protected NotifComponent notifComponent;

    @Override
    public String getObjet() {
        return super.getObjet();
    }

    @Override
    public void setObjet(String objet) {
        super.setObjet(objet);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public void setMessage(String message) {
        super.setMessage(message);
    }

    @Override
    public String getDestinataire() {
        return super.getDestinataire();
    }

    @Override
    public void setDestinataire(String destinataire) {
        super.setDestinataire(destinataire);
    }
}
