package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private final InformationService informationService;
    private final ProductRepository productRepository;
    private final SalesServiace salesServiace;

    public ProductOrderService(final InformationService informationService, final ProductRepository productRepository, final SalesServiace salesServiace) {
        this.informationService = informationService;
        this.productRepository = productRepository;
        this.salesServiace = salesServiace;
    }

    public PurchaseDto process(final Offer offer, final User buyer) {
        PurchaseDto purchaseDto = new PurchaseDto(buyer, offer);

        informationService.informSeller(offer.getSeller());

        if (offer.isActive()) {
            informationService.informBuyer(buyer);
            productRepository.finishTransation(offer);
            salesServiace.completePurchase(buyer, offer);
            return purchaseDto;
        } else {
            return purchaseDto;
        }
    }


}
