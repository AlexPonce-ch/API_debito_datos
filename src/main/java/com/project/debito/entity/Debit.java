package com.project.debito.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "debito")
public class Debit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mp_pan;
    private String mp_identcli;
    private String mp_status;
    private Integer mp_indisttar;
    private String mp_calpart;
    private String p1_indrepos;
    private String p2_apelli1;
    private String p2_nombre;
    private String lc_Catargo1_cte;
    private String lc_Catargo2_cta;
    private Double m_pago_min;
    private Double m_deuda_vcda;
    private Date d_fec_top_pag;
    private Integer i_mun_pagos_vcdos;
    private Date ri_FECVENMOV;
    private Double ic_imapgo;

}
