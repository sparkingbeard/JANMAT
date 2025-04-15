package com.BISEN.JANMAT.Services;

import java.util.List;

import com.BISEN.JANMAT.modelsPackage.Minister;

public interface MinisterService {

    Minister createMinister(Minister minister);
    Minister getMinisterById(Long id);
    List<Minister> getAllMinister();
    Minister updateMinisterById(Long id, Minister minister);
    void deleterMinisterById(Long id);
}
