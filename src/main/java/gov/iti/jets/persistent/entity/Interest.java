package gov.iti.jets.persistent.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "interests")
public class Interest {
    @EmbeddedId
    private InterestId id;

    @MapsId("userId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @MapsId("interestId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "interest_id", nullable = false)
    private Category interest;

    public InterestId getId() {
        return id;
    }

    public void setId(InterestId id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Category getInterest() {
        return interest;
    }

    public void setInterest(Category interest) {
        this.interest = interest;
    }

}