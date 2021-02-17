/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

//import java.sql.Date;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 *
 * @author Kevin
 */
@Converter
public class LocalDateConverter implements AttributeConverter<LocalDate, Date>{

    @Override
    public Date convertToDatabaseColumn(LocalDate attribute) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LocalDate convertToEntityAttribute(Date dbData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public Date convertToDatabaseColumn(LocalDate entityValue) {
////       
//      if(entityValue == null){
//          return null;
//      }
//     return Date.valueOf(entityValue);
//    }
//
//    @Override
//    public LocalDate convertToEntityAttribute(Date databaseValue) {
////        
//     if(databaseValue == null){
//         return null;
//     }
//     return databaseValue.toLocalDate();
//    }
    
}
