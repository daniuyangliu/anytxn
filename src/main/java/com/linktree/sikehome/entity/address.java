package com.linktree.sikehome.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class address implements Serializable {

    private static final long serialVersionUID = 1585925889173L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 编码
    * isNullAble:1
    */
    private String code;

    /**
    * 名称
    * isNullAble:1
    */
    private String name;

    /**
    * 父id
    * isNullAble:0,defaultVal:0
    */
    private String pid;

    /**
    * 1国家2省3市4县区
    * isNullAble:1
    */
    private Integer type;

    /**
    * 
    * isNullAble:1
    */
    private Integer lit;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setCode(String code){this.code = code;}

    public String getCode(){return this.code;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setPid(String pid){this.pid = pid;}

    public String getPid(){return this.pid;}

    public void setType(Integer type){this.type = type;}

    public Integer getType(){return this.type;}

    public void setLit(Integer lit){this.lit = lit;}

    public Integer getLit(){return this.lit;}
    @Override
    public String toString() {
        return "address{" +
                "id='" + id + '\'' +
                "code='" + code + '\'' +
                "name='" + name + '\'' +
                "pid='" + pid + '\'' +
                "type='" + type + '\'' +
                "lit='" + lit + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private address set;

        private ConditionBuilder where;

        public UpdateBuilder set(address set){
            this.set = set;
            return this;
        }

        public address getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends address{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> codeList;

        public List<String> getCodeList(){return this.codeList;}


        private List<String> fuzzyCode;

        public List<String> getFuzzyCode(){return this.fuzzyCode;}

        private List<String> rightFuzzyCode;

        public List<String> getRightFuzzyCode(){return this.rightFuzzyCode;}
        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> pidList;

        public List<String> getPidList(){return this.pidList;}


        private List<String> fuzzyPid;

        public List<String> getFuzzyPid(){return this.fuzzyPid;}

        private List<String> rightFuzzyPid;

        public List<String> getRightFuzzyPid(){return this.rightFuzzyPid;}
        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private List<Integer> litList;

        public List<Integer> getLitList(){return this.litList;}

        private Integer litSt;

        private Integer litEd;

        public Integer getLitSt(){return this.litSt;}

        public Integer getLitEd(){return this.litEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Long id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder fuzzyCode (List<String> fuzzyCode){
            this.fuzzyCode = fuzzyCode;
            return this;
        }

        public QueryBuilder fuzzyCode (String ... fuzzyCode){
            this.fuzzyCode = solveNullList(fuzzyCode);
            return this;
        }

        public QueryBuilder rightFuzzyCode (List<String> rightFuzzyCode){
            this.rightFuzzyCode = rightFuzzyCode;
            return this;
        }

        public QueryBuilder rightFuzzyCode (String ... rightFuzzyCode){
            this.rightFuzzyCode = solveNullList(rightFuzzyCode);
            return this;
        }

        public QueryBuilder code(String code){
            setCode(code);
            return this;
        }

        public QueryBuilder codeList(String ... code){
            this.codeList = solveNullList(code);
            return this;
        }

        public QueryBuilder codeList(List<String> code){
            this.codeList = code;
            return this;
        }

        public QueryBuilder fetchCode(){
            setFetchFields("fetchFields","code");
            return this;
        }

        public QueryBuilder excludeCode(){
            setFetchFields("excludeFields","code");
            return this;
        }

        public QueryBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public QueryBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public QueryBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public QueryBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public QueryBuilder name(String name){
            setName(name);
            return this;
        }

        public QueryBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public QueryBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public QueryBuilder fetchName(){
            setFetchFields("fetchFields","name");
            return this;
        }

        public QueryBuilder excludeName(){
            setFetchFields("excludeFields","name");
            return this;
        }

        public QueryBuilder fuzzyPid (List<String> fuzzyPid){
            this.fuzzyPid = fuzzyPid;
            return this;
        }

        public QueryBuilder fuzzyPid (String ... fuzzyPid){
            this.fuzzyPid = solveNullList(fuzzyPid);
            return this;
        }

        public QueryBuilder rightFuzzyPid (List<String> rightFuzzyPid){
            this.rightFuzzyPid = rightFuzzyPid;
            return this;
        }

        public QueryBuilder rightFuzzyPid (String ... rightFuzzyPid){
            this.rightFuzzyPid = solveNullList(rightFuzzyPid);
            return this;
        }

        public QueryBuilder pid(String pid){
            setPid(pid);
            return this;
        }

        public QueryBuilder pidList(String ... pid){
            this.pidList = solveNullList(pid);
            return this;
        }

        public QueryBuilder pidList(List<String> pid){
            this.pidList = pid;
            return this;
        }

        public QueryBuilder fetchPid(){
            setFetchFields("fetchFields","pid");
            return this;
        }

        public QueryBuilder excludePid(){
            setFetchFields("excludeFields","pid");
            return this;
        }

        public QueryBuilder typeBetWeen(Integer typeSt,Integer typeEd){
            this.typeSt = typeSt;
            this.typeEd = typeEd;
            return this;
        }

        public QueryBuilder typeGreaterEqThan(Integer typeSt){
            this.typeSt = typeSt;
            return this;
        }
        public QueryBuilder typeLessEqThan(Integer typeEd){
            this.typeEd = typeEd;
            return this;
        }


        public QueryBuilder type(Integer type){
            setType(type);
            return this;
        }

        public QueryBuilder typeList(Integer ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public QueryBuilder typeList(List<Integer> type){
            this.typeList = type;
            return this;
        }

        public QueryBuilder fetchType(){
            setFetchFields("fetchFields","type");
            return this;
        }

        public QueryBuilder excludeType(){
            setFetchFields("excludeFields","type");
            return this;
        }

        public QueryBuilder litBetWeen(Integer litSt,Integer litEd){
            this.litSt = litSt;
            this.litEd = litEd;
            return this;
        }

        public QueryBuilder litGreaterEqThan(Integer litSt){
            this.litSt = litSt;
            return this;
        }
        public QueryBuilder litLessEqThan(Integer litEd){
            this.litEd = litEd;
            return this;
        }


        public QueryBuilder lit(Integer lit){
            setLit(lit);
            return this;
        }

        public QueryBuilder litList(Integer ... lit){
            this.litList = solveNullList(lit);
            return this;
        }

        public QueryBuilder litList(List<Integer> lit){
            this.litList = lit;
            return this;
        }

        public QueryBuilder fetchLit(){
            setFetchFields("fetchFields","lit");
            return this;
        }

        public QueryBuilder excludeLit(){
            setFetchFields("excludeFields","lit");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public address build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> codeList;

        public List<String> getCodeList(){return this.codeList;}


        private List<String> fuzzyCode;

        public List<String> getFuzzyCode(){return this.fuzzyCode;}

        private List<String> rightFuzzyCode;

        public List<String> getRightFuzzyCode(){return this.rightFuzzyCode;}
        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> pidList;

        public List<String> getPidList(){return this.pidList;}


        private List<String> fuzzyPid;

        public List<String> getFuzzyPid(){return this.fuzzyPid;}

        private List<String> rightFuzzyPid;

        public List<String> getRightFuzzyPid(){return this.rightFuzzyPid;}
        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private List<Integer> litList;

        public List<Integer> getLitList(){return this.litList;}

        private Integer litSt;

        private Integer litEd;

        public Integer getLitSt(){return this.litSt;}

        public Integer getLitEd(){return this.litEd;}


        public ConditionBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyCode (List<String> fuzzyCode){
            this.fuzzyCode = fuzzyCode;
            return this;
        }

        public ConditionBuilder fuzzyCode (String ... fuzzyCode){
            this.fuzzyCode = solveNullList(fuzzyCode);
            return this;
        }

        public ConditionBuilder rightFuzzyCode (List<String> rightFuzzyCode){
            this.rightFuzzyCode = rightFuzzyCode;
            return this;
        }

        public ConditionBuilder rightFuzzyCode (String ... rightFuzzyCode){
            this.rightFuzzyCode = solveNullList(rightFuzzyCode);
            return this;
        }

        public ConditionBuilder codeList(String ... code){
            this.codeList = solveNullList(code);
            return this;
        }

        public ConditionBuilder codeList(List<String> code){
            this.codeList = code;
            return this;
        }

        public ConditionBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public ConditionBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public ConditionBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public ConditionBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public ConditionBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public ConditionBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public ConditionBuilder fuzzyPid (List<String> fuzzyPid){
            this.fuzzyPid = fuzzyPid;
            return this;
        }

        public ConditionBuilder fuzzyPid (String ... fuzzyPid){
            this.fuzzyPid = solveNullList(fuzzyPid);
            return this;
        }

        public ConditionBuilder rightFuzzyPid (List<String> rightFuzzyPid){
            this.rightFuzzyPid = rightFuzzyPid;
            return this;
        }

        public ConditionBuilder rightFuzzyPid (String ... rightFuzzyPid){
            this.rightFuzzyPid = solveNullList(rightFuzzyPid);
            return this;
        }

        public ConditionBuilder pidList(String ... pid){
            this.pidList = solveNullList(pid);
            return this;
        }

        public ConditionBuilder pidList(List<String> pid){
            this.pidList = pid;
            return this;
        }

        public ConditionBuilder typeBetWeen(Integer typeSt,Integer typeEd){
            this.typeSt = typeSt;
            this.typeEd = typeEd;
            return this;
        }

        public ConditionBuilder typeGreaterEqThan(Integer typeSt){
            this.typeSt = typeSt;
            return this;
        }
        public ConditionBuilder typeLessEqThan(Integer typeEd){
            this.typeEd = typeEd;
            return this;
        }


        public ConditionBuilder typeList(Integer ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public ConditionBuilder typeList(List<Integer> type){
            this.typeList = type;
            return this;
        }

        public ConditionBuilder litBetWeen(Integer litSt,Integer litEd){
            this.litSt = litSt;
            this.litEd = litEd;
            return this;
        }

        public ConditionBuilder litGreaterEqThan(Integer litSt){
            this.litSt = litSt;
            return this;
        }
        public ConditionBuilder litLessEqThan(Integer litEd){
            this.litEd = litEd;
            return this;
        }


        public ConditionBuilder litList(Integer ... lit){
            this.litList = solveNullList(lit);
            return this;
        }

        public ConditionBuilder litList(List<Integer> lit){
            this.litList = lit;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private address obj;

        public Builder(){
            this.obj = new address();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder code(String code){
            this.obj.setCode(code);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder pid(String pid){
            this.obj.setPid(pid);
            return this;
        }
        public Builder type(Integer type){
            this.obj.setType(type);
            return this;
        }
        public Builder lit(Integer lit){
            this.obj.setLit(lit);
            return this;
        }
        public address build(){return obj;}
    }

}
