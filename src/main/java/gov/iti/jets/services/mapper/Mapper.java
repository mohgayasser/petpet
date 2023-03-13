package gov.iti.jets.services.mapper;

public interface Mapper <T,R> {
    R toDto(T t);
    T toEntity(R r);
}
