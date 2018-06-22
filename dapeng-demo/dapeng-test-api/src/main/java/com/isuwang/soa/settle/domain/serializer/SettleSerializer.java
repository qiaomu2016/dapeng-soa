 package com.isuwang.soa.settle.domain.serializer;
        import com.isuwang.soa.order.domain.serializer.*;import com.github.dapeng.soa.domain.serializer.*;import com.isuwang.soa.price.domain.serializer.*;import com.isuwang.soa.user.domain.serializer.*;import com.isuwang.soa.settle.domain.serializer.*;

        import com.github.dapeng.core.*;
        import com.github.dapeng.org.apache.thrift.*;
        import com.github.dapeng.org.apache.thrift.protocol.*;

        import java.util.Optional;
        import java.util.concurrent.CompletableFuture;
        import java.util.concurrent.Future;

        /**
        * Autogenerated by Dapeng-Code-Generator (2.0.5)
        *
        * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
        *  @generated
        **/
        public class SettleSerializer implements BeanSerializer<com.isuwang.soa.settle.domain.Settle>{
        
      @Override
      public com.isuwang.soa.settle.domain.Settle read(TProtocol iprot) throws TException{

      com.isuwang.soa.settle.domain.Settle bean = new com.isuwang.soa.settle.domain.Settle();
      com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.I32){
               int elem0 = iprot.readI32();
       bean.setId(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 2:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.I32){
               int elem0 = iprot.readI32();
       bean.setOrderId(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 3:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.DOUBLE){
               double elem0 = iprot.readDouble();
       bean.setCash_debit(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 4:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.DOUBLE){
               double elem0 = iprot.readDouble();
       bean.setCash_credit(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 5:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setRemark(Optional.of(elem0));
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
          
            default:
            com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      validate(bean);
      return bean;
    }
    
      @Override
      public void write(com.isuwang.soa.settle.domain.Settle bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("Settle"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("id", com.github.dapeng.org.apache.thrift.protocol.TType.I32, (short) 1));
            Integer elem0 = bean.getId();
            oprot.writeI32(elem0);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("orderId", com.github.dapeng.org.apache.thrift.protocol.TType.I32, (short) 2));
            Integer elem1 = bean.getOrderId();
            oprot.writeI32(elem1);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("cash_debit", com.github.dapeng.org.apache.thrift.protocol.TType.DOUBLE, (short) 3));
            Double elem2 = bean.getCash_debit();
            oprot.writeDouble(elem2);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("cash_credit", com.github.dapeng.org.apache.thrift.protocol.TType.DOUBLE, (short) 4));
            Double elem3 = bean.getCash_credit();
            oprot.writeDouble(elem3);
            
            oprot.writeFieldEnd();
          if(bean.getRemark().isPresent()){
              oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("remark", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 5));
              String elem4 = bean.getRemark().get();
              oprot.writeString(elem4);
              
            }
            
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(com.isuwang.soa.settle.domain.Settle bean) throws TException{
      
    }
    
        @Override
        public String toString(com.isuwang.soa.settle.domain.Settle bean)
        {return bean == null ? "null" : bean.toString();}
      }
      

      