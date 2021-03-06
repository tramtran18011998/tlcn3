package com.example.demo.service;

import com.example.demo.model.InvoiceProduct;

import java.util.List;
import java.util.Optional;

public interface InvoiceProductService {
    List<InvoiceProduct> findAllInvoiceProduct();
    Optional<InvoiceProduct> findInvoiceProductById(long id);
    void save(InvoiceProduct invoiceProduct);
    void delete(InvoiceProduct invoiceProduct);
}
