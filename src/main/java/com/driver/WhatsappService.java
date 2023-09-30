package com.driver;

import org.springframework.stereotype.Service;
@Service
class WhatsappService {


        WhatsappRepository whatsappRepository = new WhatsappRepository();

        public String createUser(String name, String mobile) throws Exception {
            return whatsappRepository.createUser(name, mobile);
        }
}
