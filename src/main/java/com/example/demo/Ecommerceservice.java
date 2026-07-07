
package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

        @Service
        public class Ecommerceservice
        {

            private List<Ecommerce> data = new ArrayList<>();

            public List<Ecommerce> getdata()
            {
                data.add(new Ecommerce("trimmer", "surf", "vivo"));
                data.add(new Ecommerce("hair dryer", "dals", "oppo"));
                data.add(new Ecommerce("massager", "rice", "samsung"));
                data.add(new Ecommerce("water heater", "frozen items", "iphone"));

                return data;
            }

            public Ecommerce addproduct(Ecommerce ecommerce)
            {
                data.add(ecommerce);
                return ecommerce;
            }
        }
