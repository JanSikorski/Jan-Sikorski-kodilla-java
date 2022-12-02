package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private ProductRepository productRepository;
    private SalesServiace salesServiace;
    private final User buyer;

    public ProductOrderService(final InformationService informationService, final ProductRepository productRepository, final SalesServiace salesServiace, final User buyer) {
        this.informationService = informationService;
        this.productRepository = productRepository;
        this.salesServiace = salesServiace;
        this.buyer = buyer;
    }

    public PurchaseDto process(final Offer offer) {
        PurchaseDto purchaseDto = new PurchaseDto(buyer, offer);

        if (offer.isActive()) {
            informationService.informBuyer(offer.getSeller());
            productRepository.finishTransation(offer);
            salesServiace.completePurchase(buyer, offer);
            return purchaseDto;
        } else {
            return purchaseDto;
        }
    }


}
