package c.generic;

public class GenericSample {
    public static void main(String[] args) {
        GenericSample sample=new GenericSample();
        sample.checkCastingDTO();
    }

    public void checkCastingDTO(){
        CastingDTO dto1=new CastingDTO();
        dto1.setObject(new String());
        checkDTO(dto1);

        CastingDTO dto2=new CastingDTO();
        dto2.setObject(new StringBuffer());
        checkDTO(dto2);

        CastingDTO dto3=new CastingDTO();
        dto3.setObject(new StringBuilder());
        checkDTO(dto3);

        String temp1 = (String) dto1.getObject();
        StringBuffer temp2 = (StringBuffer) dto2.getObject();
        StringBuilder temp3 = (StringBuilder) dto3.getObject();
    }

    public void checkDTO(CastingDTO dto){
        Object tempObject = dto.getObject();
        if(tempObject instanceof StringBuffer){
            System.out.println("stringbuffer");
        }else if (tempObject instanceof StringBuilder){
            System.out.println("stringbuilder");
        }else {
            System.out.println("other type");
        }
    }
    public void checkGenericDTO(){
        CastingGenericDTO<String> dto1 = new CastingGenericDTO<String>();
        dto1.setObject(new String());
        CastingGenericDTO<StringBuffer> dto2 = new CastingGenericDTO<StringBuffer>();
        dto2.setObject(new StringBuffer());
        CastingGenericDTO<StringBuilder> dto3 = new CastingGenericDTO<StringBuilder>();
        dto3.setObject(new StringBuilder());

        String temp1 = dto1.getObject();
        StringBuffer temp2 = dto2.getObject();
        StringBuilder temp3 = dto3.getObject();
    }
}
