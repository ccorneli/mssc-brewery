package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
           return CustomerDto.builder().id(UUID.randomUUID())
                    .customerName("Bar Customer name")
                    .build();
        }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //TODO: placeholder
        log.error("Update Customer not yet implemented") ;
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        //TODO: implement
        log.error("Delete customer not yet implemented");
    }
}

