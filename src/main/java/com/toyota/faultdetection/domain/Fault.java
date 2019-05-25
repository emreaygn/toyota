package com.toyota.faultdetection.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ARIZATOYOTA")
public class Fault {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "kayit_no", nullable = false)
    private Long id;

    @Column(name = "kayit_tarihi", nullable = false)
    private Date registerDate;

    @Column(name = "kayit_yapan", nullable = false)
    private String recorder;

    @Column(name = "bildiren", nullable = false)
    private String reporter;

    @Column(name = "bildiren_tel", nullable = false)
    private int reporterTel;

    @Column(name = "ariza", nullable = false)
    private String faultType;

    @Column(name = "yeri", nullable = false)
    private String location;

    @Column(name = "shop", nullable = false)
    private String shop;

    @Column(name = "atanan", nullable = false)
    private String assigned;

    @Column(name = "acil", nullable = false)
    private String emergency;

    @Column(name = "is_bitimi_aciklama", nullable = false)
    private String explanation;

    @Column(name = "tamamlama_tarihi", nullable = false)
    private Date endDay;

    @Column(name = "kayit_turu", nullable = false)
    private String kayitTuru;
}