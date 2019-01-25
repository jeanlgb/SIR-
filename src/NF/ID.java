package NF;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral Olivia
 */
public class ID {
    private int numero_id;
    private Type_ID type_ID;

    public ID(int numero_id, Type_ID type_ID) {
        this.numero_id = numero_id;
        this.type_ID = type_ID;
    }

    @Override
    public String toString() {
        return "ID{" + "numero_id=" + numero_id + ", type_ID=" + type_ID + '}';
    }

    
    /**
     * @return the numero_id
     */
    public int getNumero_id() {
        return numero_id;
    }

    /**
     * @param numero_id the numero_id to set
     */
    public void setNumero_id(int numero_id) {
        this.numero_id = numero_id;
    }

    /**
     * @return the type_ID
     */
    public Type_ID getType_ID() {
        return type_ID;
    }

    /**
     * @param type_ID the type_ID to set
     */
    public void setType_ID(Type_ID type_ID) {
        this.type_ID = type_ID;
    }
    
    

}
