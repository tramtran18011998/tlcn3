package com.example.demo.serviceimpl;

import com.example.demo.model.InvoiceProduct;
import com.example.demo.repository.InvoiceProductRepository;
import com.example.demo.service.InvoiceProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceProductServiceImpl implements InvoiceProductService {

    InvoiceProductRepository invoiceProductRepository;

    @Autowired
    public InvoiceProductServiceImpl(InvoiceProductRepository invoiceProductRepository){
        this.invoiceProductRepository=invoiceProductRepository;
    }
    @Override
    public List<InvoiceProduct> findAllInvoiceProduct() {
        return invoiceProductRepository.findAll();
    }

    @Override
    public Optional<InvoiceProduct> findInvoiceProductById(long id) {
        return invoiceProductRepository.findById(id);
    }

    @Override
    public void save(InvoiceProduct invoiceProduct) {
        invoiceProductRepository.save(invoiceProduct);
    }

    @Override
    public void delete(InvoiceProduct invoiceProduct) {
        invoiceProductRepository.delete(invoiceProduct);
    }
}
