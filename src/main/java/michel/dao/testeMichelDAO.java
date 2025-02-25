package michel.dao;

import javax.persistence.*;
import michel.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class testeMichelDAO extends BasicDAO<String, testeMichel> implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -309224618l;

  /**
   * Guarda uma cópia da EntityManager na instância
   * 
   * @param entitymanager
   *          Tabela do banco
   * @generated
   */
  public testeMichelDAO(EntityManager entitymanager) {
    super(entitymanager);
  }



  /**
   * Remove a instância de testeMichel utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String id){
      Query query = this.entityManager.createQuery("DELETE FROM testeMichel entity WHERE entity.id = :id");
      query.setParameter("id", id);
           
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de testeMichel utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public testeMichel findById(java.lang.String id){
      TypedQuery<testeMichel> query = this.entityManager.createQuery("SELECT entity FROM testeMichel entity WHERE entity.id = :id", testeMichel.class);
      query.setParameter("id", id);
           
      return query.getSingleResult();	
  }



}